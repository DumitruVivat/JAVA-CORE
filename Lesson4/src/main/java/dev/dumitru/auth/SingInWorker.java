package dev.dumitru.auth;

public class SingInWorker {
    public static class WrongPasswordException extends RuntimeException {
        private int currentLength;
        private boolean matchConfirm;
        public WrongPasswordException(int currentLength, boolean matchConfirm) {
            super();
            this.currentLength = currentLength;
            this.matchConfirm = matchConfirm;
        }

        @Override
        public String getMessage() {
            boolean badlen = currentLength <= 20;
            return String.format("Your password is of %scorrect length%s %d. Password %smatch the confirmation.",
                    ((badlen) ? "in" : ""),
                    ((badlen) ? ", expected > 20, given" : ","),
                    currentLength,
                    (matchConfirm) ? "" : "doesn't ");
        }
    }
    public static class WrongLoginException extends RuntimeException {
        private int currentLength;
        public WrongLoginException(int currentLength) {
            super();
            this.currentLength = currentLength;
        }

        @Override
        public String getMessage() {
            return String.format("Your login is of incorrect length, expected < 20, given %d.", currentLength);
        }
    }
    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        boolean conf = password.equals(confirmPassword);
        int llen = login.length();
        int plen = password.length();
        if (llen >= 20)
            throw new WrongLoginException(llen);
        else if (plen < 20 || !conf)
            throw new WrongPasswordException(plen, conf);
        else
            return true;
    }
    public static void main(String[] args) {
        String[][] credentials = {
                {"ivan", "1i2v3a4n5i6v7a8n91011", "1i2v3a4n5i6v7a8n91011"},
                {"1i2v3a4n5i6v7a8n91011", "", ""},
                {"ivan", "1i2v3a4n5i6v7a8n91011", "1i2v3a4n5"},
                {"ivan", "1i2v3a4n5", "1i2v3a4n5"},
                {"ivan", "1i2v3a4n5", "1i"}
        };
        for (int i = 0; i < credentials.length; i++) {
            try {
                System.out.println(checkCredentials(credentials[i][0], credentials[i][1], credentials[i][2]));
            } catch (WrongLoginException e) {
                e.printStackTrace();
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
