package com.appdirect.sdk.vendorFields.model.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Validations {
    private boolean required;
    private boolean readonly;
    private int minLength;
    private int maxLength;
    private String expression;
}
