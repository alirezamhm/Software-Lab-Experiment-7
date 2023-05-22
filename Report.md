Refactoring
==============

**Student 1**: Alireza Mohammadian - 97110188

**Student 2**: Kian Bakhtari - 97110025

# Report

## 1. Facade

For this refactoring task we have to decrease coupling for different packages used in the project (although there isn't really any coupling happening here!). For this purpose, we add a Facade class called _SymbolFacade_ in the _semantic.symbol_ package. Then, anywhere that we need to have a _SymbolTable_ or _Symbol_ object we use this class.

Created _SymbolFacade_ and changed _CodeGenerator_.

## 2. State/Strategy

In this task we have to change an conditional statement with polymorphism. We will create three subclasses for _Action_ class called _Shift_, _Reduce_, and _Accept_. Then we override the _toString_ function in each of them instead of using switch case statement.

changed _ParseTable_ and _Action_ and added _Shift_, _Reduce_, and _Accept_.

## 3. Separate Query From Modifier

In this refactoring technique we have to change a function that returns a value but also changes something inside an object to two separate functions. We changed _getTemp_ function in memory to two different functions, the first one create required space for the temp and second one will return the last temp space.

changed _Memory_ and _CodeGenerator_.

## 4. Self Encapsulated Field

For this technique, we have to change a private field to have getter and setter.

changed _LexicalAnalyzer_.

## 5. Inline Method

We can remove obvious methods and use its content itself. For example, in _CodeGenerator_ we can remove _lastSymbolBool_ function and replace it with its content.

changed _CodeGenerator_.

## 6. Extract Method

We can extract some code fragment that can be put into a separate function. For example in _Rule_ class some part of the constructor can be changed into a separate function called _createRHS_.

changed _Rule_.


# Questions