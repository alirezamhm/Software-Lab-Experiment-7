Refactoring
==============

**Student 1**: Alireza Mohammadian - 97110188

**Student 2**: Kian Bakhtari - 97110025

# Report

## 1. Facade

For this refactoring we have to decrease coupling for different packages used in the project (although there isn't really any coupling happening here!). For this purpose, we add a Facade class called _SymbolFacade_ in the _semantic.symbol_ package. Then, anywhere that we need to have a _SymbolTable_ or _Symbol_ object we use this class.
