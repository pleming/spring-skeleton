package org.skeleton.spring.code;

public final class ResponseCode {
    public static enum Signup implements ResponseCodeInterface {
        DUPLICATE_USER(false, 1, "동일한 이름의 사용자가 존재합니다."),
        SIGNUP_SUCCESS(true, 2, "회원가입이 완료되었습니다.");

        private final boolean status;
        private final Integer code;
        private final String contents;

        Signup(boolean status, Integer code, String contents) {
            this.status = status;
            this.code = code;
            this.contents = contents;
        }

        @Override
        public boolean getStatus() {
            return status;
        }

        @Override
        public Integer getCode() {
            return code;
        }

        @Override
        public String getContents() {
            return contents;
        }
    }

    public static enum Signin implements ResponseCodeInterface {
        ID_OR_PASSWD_MISMATCH(false, 1, "아이디 또는 패스워드가 일치하지 않습니다."),
        SIGNIN_SUCCESS(true, 2, "로그인이 완료되었습니다.");

        private final boolean status;
        private final Integer code;
        private final String contents;

        Signin(boolean status, Integer code, String contents) {
            this.status = status;
            this.code = code;
            this.contents = contents;
        }

        @Override
        public boolean getStatus() {
            return status;
        }

        @Override
        public Integer getCode() {
            return code;
        }

        @Override
        public String getContents() {
            return contents;
        }
    }

    public static enum Signout implements ResponseCodeInterface {
        SIGNOUT_SUCCESS(true, 1, "로그아웃이 완료되었습니다."),
        SIGNOUT_FAILED(false, 2, "로그아웃을 실패하였습니다.");

        private final boolean status;
        private final Integer code;
        private final String contents;

        Signout(boolean status, Integer code, String contents) {
            this.status = status;
            this.code = code;
            this.contents = contents;
        }

        @Override
        public boolean getStatus() {
            return status;
        }

        @Override
        public Integer getCode() {
            return code;
        }

        @Override
        public String getContents() {
            return contents;
        }
    }

    public static enum Session implements ResponseCodeInterface {
        SESSION_VALID(true, 1, "유효한 세션이 존재합니다."),
        SESSION_INVALID(false, 2, "유효한 세션이 존재하지 않습니다.");

        private final boolean status;
        private final Integer code;
        private final String contents;

        Session(boolean status, Integer code, String contents) {
            this.status = status;
            this.code = code;
            this.contents = contents;
        }

        @Override
        public boolean getStatus() {
            return status;
        }

        @Override
        public Integer getCode() {
            return code;
        }

        @Override
        public String getContents() {
            return contents;
        }
    }

    public static enum Ajax implements ResponseCodeInterface {
        AJAX_GET(true, 1, "AJAX GET SAMPLE"),
        AJAX_POST(true, 2, "AJAX POST SAMPLE");

        private final boolean status;
        private final Integer code;
        private final String contents;

        Ajax(boolean status, Integer code, String contents) {
            this.status = status;
            this.code = code;
            this.contents = contents;
        }

        @Override
        public boolean getStatus() {
            return status;
        }

        @Override
        public Integer getCode() {
            return code;
        }

        @Override
        public String getContents() {
            return contents;
        }
    }
}
