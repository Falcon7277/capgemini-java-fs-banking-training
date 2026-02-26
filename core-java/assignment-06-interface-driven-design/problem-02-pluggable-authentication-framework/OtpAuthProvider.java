public class OtpAuthProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(String userId, String credential) {
        if (!AuthenticationProvider.validateUserId(userId)) {
            return false;
        }

        return "456789".equals(credential);//hardcoded check
    }
}
