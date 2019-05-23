# The repo contains answers for exercises from the book: Cracking the Coding Interview, 6th Edition

Tech stack:
- Java 8

## Chapter 1
### Arrays and Strings
Solved in the StringsDataStructures file
methods:
- varyingCharactersOne - checks if given String has no repeatable characters
- reverseCString - reverses a C Style String (char array)
- remove duplicates - removes duplicate characters from a string
- isAnagram - checks if the two given strings are anagrams
- replaceSpace - removes all Spaces from a String
- fillWithZeros - accept a matrix (two dimension array)
if any value in the matrix is a zero it sets the values in the row and column 
to zeros

### Linked Lists 
Solved in LinkedLists package
Contains two classes : Node and LinkedList.
Node has two fields: Node next and data of generic type <T>. 

LinkedList class contains following methods:
- addToFront - adds new Node to the front of the List
- addToTail - adds new Node to the tail of the List
- displayList - displays the Linked List
- removeDuplicates - removes duplicate data from the List
- findMiddleNode - finds the middle element of the list
- removeMiddleNode - removes middle Node with help of the findMiddleNode method
- addRandomValuesInteger and addRandomValuesChar - fills the List with either
char or integer values (created for purpose of testing the methods above)


