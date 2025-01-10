package ru.kre4.types.integer;

import java.lang.constant.ClassDesc;

/**
 * AKA Long
 */
public final class BigInt extends LongBased {

    public BigInt(Long value) {
        super(value);
    }

    @Override
    protected ClassDesc getDescriptor() {
        return ClassDesc.ofDescriptor("ru.kre4.types.integer.BigInt");
    }
}
