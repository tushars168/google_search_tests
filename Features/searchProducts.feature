
Feature: searching products 

Scenario Outline: searching products on amazon 

Given i am on the amazon homepage 

When i enter the "<products_name>" in the search bar 
And i click on the search button 


Then i can see the serach result successfully 

Examples: 
| products_name|
|Computer      |
| Toys         | 
|Football      | 