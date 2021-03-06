package com.appdirect.sdk.vendorFields.model.v2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VendorRequiredFieldsResponseV2 {
    private String isvIdentifier;
    private List<VendorRequiredFieldV2> fields;
}
