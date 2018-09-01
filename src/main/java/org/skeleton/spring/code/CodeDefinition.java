package org.skeleton.spring.code;

public final class CodeDefinition {
    public static enum Sample {
        SAMPLE_CODE(0);

        private final Integer code;

        Sample(Integer code) {
            this.code = code;
        }

        public Integer getCode() {
            return code;
        }
    }
}
