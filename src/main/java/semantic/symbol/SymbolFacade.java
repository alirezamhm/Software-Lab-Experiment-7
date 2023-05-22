package semantic.symbol;

import codeGenerator.Memory;

public class SymbolFacade {
    private static SymbolFacade instance = null;
    private SymbolFacade() {

    }
    public static SymbolFacade getInstance() {
        if (instance == null) {
            instance = new SymbolFacade();
        }
        return instance;
    }

    public SymbolTable createSymbolTable(Memory memory) {
        return new SymbolTable(memory);
    }

    public Symbol createSymbol(SymbolType type, int address) {
        return new Symbol(type, address);
    }
}
