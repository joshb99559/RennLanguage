package com.thelambdacomplex.renn;

import java.util.List;

interface RennCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
