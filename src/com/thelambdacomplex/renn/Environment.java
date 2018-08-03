<<<<<<< HEAD
package com.thelambdacomplex.renn;

import java.util.HashMap;
import java.util.Map;

public class Environment {
    final Environment enclosing;
    private final Map<String, Object> values = new HashMap<>();
    
    Environment() {
        enclosing = null;
    }
    
    Environment(Environment enclosing) {
        this.enclosing = enclosing;
    }
    
    void define(String name, Object value) {
        values.put(name, value);
    }
    
    void assign(Token name, Object value) {
        if (values.containsKey(name.lexeme)) {
            values.put(name.lexeme, value);
            return;
        }
        
        if (enclosing != null) {
            enclosing.assign(name, value);
            return;
        }
        
        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }
    
    Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            return values.get(name.lexeme);
        }
        
        if (enclosing != null) return enclosing.get(name);
        
        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }
}
=======
package com.thelambdacomplex.renn;

import java.util.HashMap;
import java.util.Map;

public class Environment {
    final Environment enclosing;
    private final Map<String, Object> values = new HashMap<>();
    
    Environment() {
        enclosing = null;
    }
    
    Environment(Environment enclosing) {
        this.enclosing = enclosing;
    }
    
    void define(String name, Object value) {
        values.put(name, value);
    }
    
    void assign(Token name, Object value) {
        if (values.containsKey(name.lexeme)) {
            values.put(name.lexeme, value);
            return;
        }
        
        if (enclosing != null) {
            enclosing.assign(name, value);
            return;
        }
        
        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }
    
    Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            return values.get(name.lexeme);
        }
        
        if (enclosing != null) return enclosing.get(name);
        
        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }
}
>>>>>>> 9a988bbdcf06e26d69f40fbea14aea95a88aa69c
