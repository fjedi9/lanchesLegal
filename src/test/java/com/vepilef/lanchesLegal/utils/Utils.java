package com.vepilef.lanchesLegal.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils {

    public String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
