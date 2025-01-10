package ru.kre4.types.integer;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class LongBasedConverter implements AttributeConverter<LongBased, Long> {
    @Override
    public Long convertToDatabaseColumn(LongBased attribute) {
        return attribute == null ? null : attribute.getValue();
    }

    @Override
    public BigInt convertToEntityAttribute(Long attribute) {
        return new BigInt(attribute);
    }
}
