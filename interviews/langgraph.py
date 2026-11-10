from typing import Literal
from typing_extensions import TypedDict
from langgraph.graph import StateGraph, START, END


class State(TypedDict):
    document: str
    summary: str
    approved: bool
    retries: int


def summarize(state: State) -> State:
    # calls an LLM to summarize state["document"]
    return {"summary": "<llm output>", "retries": state["retries"] + 1}


def review(state: State) -> State:
    # human-in-the-loop or automated quality check
    return {"approved": len(state["summary"]) > 50}


def route_after_review(state: State) -> Literal["summarize", "done"]:
    if not state["approved"] and state["retries"] < 3:
        return "summarize"
    return "done"


workflow = StateGraph(State)
workflow.add_node("summarize", summarize)
workflow.add_node("review", review)
workflow.add_edge(START, "summarize")
workflow.add_edge("summarize", "review")
workflow.add_conditional_edges(
    "review",
    route_after_review,
    {"summarize": "summarize", "done": END},
)
graph = workflow.compile()
