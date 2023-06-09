package org.huawei;

import java.util.function.DoubleConsumer; // #problem: wraper class name resolution
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public final class OptionalDoubleAutomaton implements LibSLRuntime.Automaton {
    public __$lsl_States __$lsl_state = __$lsl_States.Allocated;

    private double value = 0.0d;

    private boolean present = false;

    @LibSLRuntime.AutomatonConstructor
    public OptionalDoubleAutomaton(__$lsl_States __$lsl_state, double value, boolean present) {
        this.__$lsl_state = __$lsl_state;
        this.value = value;
        this.present = present;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalDoubleAutomaton() {
        this(__$lsl_States.Allocated, 0.0d, false);
    }

    public void OptionalDouble(OptionalDouble self) { // #warning: this is a constructor
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
//            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public void OptionalDouble(OptionalDouble self, double x) {
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
//            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public static OptionalDouble _makeEmpty() {
        OptionalDouble result;
        /* body */ {
            result = new OptionalDouble(new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, 0.0d, false));
        }
        return result;
    }

    public static void _throwNPE() {
        /* body */ {
            throw new java.lang.NullPointerException();
        }
    }

    public static OptionalDouble empty() {
        System.out.println("Was created empty OptionalDouble of huawei");
        OptionalDouble result;
        // WARNING: no state checks in static context
        /* body */ {
            result = _makeEmpty();
        }
        // WARNING: no state transitions in static context
        return result;
    }

    public static OptionalDouble of(double x) {
        OptionalDouble result;
        // WARNING: no state checks in static context
        /* body */ {
            result = new OptionalDouble(new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, x, true));
        }
        // WARNING: no state transitions in static context
        return result;
    }

//    public boolean equals(OptionalDouble self, Object other) {
//        boolean result;
//        if (this.__$lsl_state != __$lsl_States.Initialized) {
//            LibSLRuntime.automatonStateCheckViolation();
//        }
//        /* body */ {
//            if (other == this) {
//                result = true;
//            } else {
//                final boolean isSameType = EngineInterfacing.isSameType(self, other);
//                if (isSameType) {
//                    final double otherValue = ((OptionalDoubleAutomaton) ((LibSLRuntime.HasAutomaton) other).__$lsl_getAutomaton()).value;
//                    final boolean otherPresent = ((OptionalDoubleAutomaton) ((LibSLRuntime.HasAutomaton) other).__$lsl_getAutomaton()).present;
//                    if (this.present && otherPresent) {
//                        result = this.value == otherValue;
//                    } else {
//                        result = this.present == otherPresent;
//                    }
//                } else {
//                    result = false;
//                }
//            }
//        }
//        return result;
//    }

    public double getAsDouble(OptionalDouble self) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            if (!this.present) {
                throw new java.util.NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

//    public int hashCode(OptionalDouble self) {
//        int result;
//        if (this.__$lsl_state != __$lsl_States.Initialized) {
//            LibSLRuntime.automatonStateCheckViolation();
//        }
//        /* body */ {
//            if (this.present) {
//                result = EngineInterfacing.hashCode(this.value);
//            } else {
//                result = 0;
//            }
//        }
//        return result;
//    }

    public void ifPresent(OptionalDouble self, DoubleConsumer consumer) {
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new java.lang.NullPointerException();
                }
                consumer.accept(this.value);
            }
        }
    }

    public void ifPresentOrElse(OptionalDouble self, DoubleConsumer consumer,
                                Runnable emptyAction) {
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new java.lang.NullPointerException();
                }
                consumer.accept(this.value);
            } else {
                if (emptyAction == null) {
                    throw new java.lang.NullPointerException();
                }
                emptyAction.run();
            }
        }
    }

    public boolean isEmpty(OptionalDouble self) {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            result = !this.present;
        }
        return result;
    }

    public boolean isPresent(OptionalDouble self) {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            result = this.present;
        }
        return result;
    }

    public double orElse(OptionalDouble self, double other) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            if (this.present) {
                result = this.value;
            } else {
                result = other;
            }
        }
        return result;
    }

//    public double orElseGet(OptionalDouble self, DoubleSupplier supplier) {
//        double result;
//        if (this.__$lsl_state != __$lsl_States.Initialized) {
//            LibSLRuntime.automatonStateCheckViolation();
//        }
//        /* body */ {
//            if (supplier == null) {
//                throw new java.lang.NullPointerException();
//            }
//            if (this.present) {
//                result = this.value;
//            } else {
//                result = supplier.get();
//            }
//        }
//        return result;
//    }

    public double orElseThrow(OptionalDouble self) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            LibSLRuntime.automatonStateCheckViolation();
        }
        /* body */ {
            if (!this.present) {
                throw new java.util.NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

//    public <X extends java.lang.Throwable> double orElseThrow(OptionalDouble self,
//                                                              Supplier<X> exceptionSupplier) throws X {
//        double result;
//        if (this.__$lsl_state != __$lsl_States.Initialized) {
//            LibSLRuntime.automatonStateCheckViolation();
//        }
//        /* body */ {
//            if (exceptionSupplier == null) {
//                throw new java.lang.NullPointerException();
//            }
//            if (!this.present) {
//                final Object exception = exceptionSupplier.get();
//                throw ((Throwable) exception);
//            } else {
//                result = this.value;
//            }
//        }
//        return result;
//    }

//    public DoubleStream stream(OptionalDouble self) {
//        DoubleStream result;
//        if (this.__$lsl_state != __$lsl_States.Initialized) {
//            LibSLRuntime.automatonStateCheckViolation();
//        }
//        /* body */ {
//            LibSLRuntime.not_implemented();
//        }
//        return result;
//    }

//    public String toString(OptionalDouble self) {
//        String result;
//        if (this.__$lsl_state != __$lsl_States.Initialized) {
//            LibSLRuntime.automatonStateCheckViolation();
//        }
//        /* body */ {
//            if (this.present) {
//                final String valueStr = EngineInterfacing.toString(this.value);
//                result = "OptionalDouble[" + valueStr + "]";
//            } else {
//                result = "OptionalDouble.empty";
//            }
//        }
//        return result;
//    }

    public enum __$lsl_States {
        Allocated,

        Initialized
    }
}