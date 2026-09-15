/*
Exercise 1
Implement a function that takes a tag as input and returns a list of restaurants that have the specified tag.
Input
tag: A string representing the tag to filter restaurants by.
Output
A list of objects representing the restaurants that have the specified tag.
*/

class Julia1 {
    returnListOfRestaurants(tag, json){
        let restaurants = JSON.parse(json);
        let result = [];

        for(let i = 0; i<restaurants.length; i++){
            for(let j = 0; j<restaurants[i].tags.length; j++){
                if(restaurants[i].tags[j] == tag) {
                    result.push(restaurants[i].name);
                }
            }

        }

        return result;

    }

}

const json = `
[
    {
        "name": "Piatto di Nonno",
        "tags": [ "Italian", "Pasta", "Pizza" ],
        "opening_hours": {
            "open": 36000,
            "close": 79200
        }
    },
 
    {
        "name": "El Barón",
        "tags": [ "Mexican", "Tacos", "Spicy" ],
        "opening_hours": {
            "open": 36000, 
            "close": 82800
        }
    },
 
    {
        "name": "Early Bird Cafe",
        "tags": ["Coffee", "Omelettes", "Pancakes", "Fresh Fruit"],
        "opening_hours": {
            "open": 21600,
            "close": 36000
        }
    },
 
    {
        "name": "Funny Feelings",
        "tags": ["Coffee", "Pasta", "Pancakes", "Drinks"],
        "opening_hours": {
            "open": 64800,
            "close": 79200
        }
    },
 
    {
        "name": "Ristorante La Famiglia",
        "tags": [ "Italian", "Pasta", "Seafood" ],
        "opening_hours": {
            "open": 41400,
            "close": 79200
        }
    },
 
    {
        "name": "Crazy Hot Dog",
        "tags": [ "Fast Food", "Hot Dog" ],
        "opening_hours": {
            "open": 0,
            "close": 86400
        }
    },
 
    {
        "name": "The Burger Joint",
        "tags": [ "American", "Burgers", "Fast Food" ],
        "opening_hours": {
            "open": 39600,
            "close": 78600
        }
    },
 
    {
        "name": "Sushi Delight",
        "tags": [ "Japanese", "Sushi", "Seafood" ],
        "opening_hours": {
            "open": 41400,
            "close": 79200
        }
    }
]
`;

let julia1 = new Julia1();

console.log(julia1.returnListOfRestaurants("Pasta",json));