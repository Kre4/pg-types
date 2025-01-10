package ru.kre4.types.integer;

import java.lang.constant.ClassDesc;
import java.lang.constant.Constable;
import java.lang.constant.DynamicConstantDesc;
import java.util.Optional;

import static java.lang.constant.ConstantDescs.BSM_EXPLICIT_CAST;
import static java.lang.constant.ConstantDescs.DEFAULT_NAME;

/**
 * AKA Long
 */
public final class BigInt extends Number
        implements Comparable<BigInt>, Constable {
    private final Long value;

    public BigInt(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public int compareTo(BigInt o) {
        return Long.compare(o.getValue(), value);
    }

    public int compareTo(Long o) {
        return Long.compare(o, value);
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }

    @Override
    public Optional<DynamicConstantDesc<BigInt>> describeConstable() {
        return Optional.of(DynamicConstantDesc.ofNamed(BSM_EXPLICIT_CAST, DEFAULT_NAME,
                ClassDesc.ofDescriptor("ru.kre4.types.integer.BigInt"), longValue()));
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        return value.equals(o);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
