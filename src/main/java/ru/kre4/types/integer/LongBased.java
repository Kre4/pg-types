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
abstract class LongBased extends Number
        implements Comparable<LongBased>, Constable {
    private final Long value;

    protected LongBased(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public int compareTo(LongBased o) {
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
    public Optional<DynamicConstantDesc<LongBased>> describeConstable() {
        return Optional.of(DynamicConstantDesc.ofNamed(BSM_EXPLICIT_CAST, DEFAULT_NAME,
                getDescriptor(), longValue()));
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

    protected abstract ClassDesc getDescriptor();
}
