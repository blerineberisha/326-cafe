# Cafe shop

With his café shop, a user can view items like coffee, baked goods and other, and add extras to their orders
i.e., adding glazing, chocolate sauce, maple syrup, sprinkles, extra whipped cream, extra flavor (vanilla, caramel, hazelnut), etc. 

---
## Overview

- [Short description](#cafe-shop)
- [Diagrams](#diagrams)
- [Changes I've made](#changes-ive-made)
- [Use cases](#use-cases)
- [Testing](#testing)
- [Improvement ideas](#improvement-ideas)

---
## Diagrams

Both, the domain diagram and the use case diagram can be found on the following website:
https://blerineberisha.github.io/diagrams/

---
## Changes I've made
First and foremost I didn't change much of the structure.  
I added
a few classes (Amaretto, NoSide, NoPastry,
Water, Fries, Salad, Breakfast, Sandwich, Espresso,
Croissant, IOHandler) or 
removed some classes (Tea, Softdrink, Meal). But the relationship between 
the objects did not change.  
It all stayed the same in terms of relationship.  
I also wanted to start this project as a gradle project and work 
with REST, but quickly threw that idea out the window, once the
authorisation decided to fail me constantly.  
And so a normal java project has been created!

---
## Use cases

### Customer view

#### Use case 1 - creating an order

##### Pre-condition
An arraylist that stores order instances
##### Post-condition
An arraylist that has a new order instance in it
and grew by 1.
##### Exceptions
Technically a NullPointerException could occur, 
but since the arraylist is given and can't be 
deleted, that can't happen.

---
#### Use case 2 - ordering a beverage
##### Pre-condition
An arraylist that stores order instances and an order instance
to store an item in
##### Post-condition
An arraylist that has a new order instance in it
and grew by 1.
##### Exceptions
Technically a NullPointerException could occur,
but since the arraylist and order are given in the
according method and can't be
deleted, that can't happen.

---
#### Use case 3 - ordering a menu
##### Pre-condition
An arraylist that stores order instances and an order instance
to store an item in
##### Post-condition
An arraylist that has a new order instance in it
and grew by 1.
##### Exceptions
Technically a NullPointerException could occur,
but since the arraylist and order are given in the
according method and can't be
deleted, that can't happen.

---
#### Use case 4 - ordering a menu with a side
##### Pre-condition
An arraylist that stores order instances and an order instance
to store an item in
##### Post-condition
An arraylist that has a new order instance in it
and grew by 1.
##### Exceptions
Technically a NullPointerException could occur,
but since the arraylist and order are given in the
according method and can't be
deleted, that can't happen.

---
#### Use case 5 - ordering a menu with a side and a beverage
##### Pre-condition
An arraylist that stores order instances and an order instance
to store an item in
##### Post-condition
An arraylist that has a new order instance in it
and grew by 1.
##### Exceptions
Technically a NullPointerException could occur,
but since the arraylist and order are given in the
according method and can't be
deleted, that can't happen.

---
#### Use case 6 - cancelling an order
##### Pre-condition
An order to store items in
##### Post-condition
An arraylist that has no new order in it
##### Exceptions
No exception should happen at this point.

---
#### Use case 7 - ordering food
##### Pre-condition
An arraylist that stores order instances and an order instance
##### Post-condition
An arraylist that has a new order instance in it
and grew by 1.
##### Exceptions
Technically a NullPointerException could occur,
but since the arraylist and order are given in the
according method and can't be
deleted, that can't happen.

---
### Admin view

#### Use case 8 - view all orders
##### Pre-condition
An arraylist that has all orders stored
##### Post-condition
All orders printed in console - no change in state or variables.
##### Exceptions
Technically a NullPointerException could occur,
but since the arraylist and order are given, 
and can't be deleted, that can't happen.

---
#### Use case 9 - delete an order
##### Pre-condition
An arraylist that has all orders stored
##### Post-condition
An order has been removed from the arraylist that stores
all orders.
##### Exceptions
An IndexOutOfBoundsException could occur.

---
#### Use case 10 - delete all orders
##### Pre-condition
An arraylist that has all orders stored
##### Post-condition
The arraylist which contained all orders is empty now.
##### Exceptions
No error can occur.

---

## Testing
In my project I mainly test whether the validation works and the return values are correct.
More specifically, I test: 
- the return value of the description of an item
- the return value of the cost of an item
- calculating the entire cost of an order
- calculating the change when a user pays
- the validation for inputs of type integer
- the validation for inputs of type string
- the validation for inputs of type double

---
## Improvement ideas
The project can be improved by making it more compact and applicable to more 
different items or persist the orders in a database for example.  

Ideas:
- adding softdrinks and make water extend softdrinks instead of Beverage directly
- adding more sides
- adding more food options
- create more preset menus
- persist orders in database
- adding more pastries
- adding extras to pastries (PastryDecorator)
- adding Sauces (FoodDecorator/MenuDecorator)
- make food items personalised as well (Sandwich with no pickles, sandwich with extra tomato, etc.)
- add different coffees (Decaf, Cappuccino, Macchiato, etc.)
- etc.
