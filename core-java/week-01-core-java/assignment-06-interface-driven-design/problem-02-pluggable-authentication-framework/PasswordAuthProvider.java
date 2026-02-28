public class PasswordAuthProvider implements AuthenticationProvider{
    @Override
    public boolean authenticate(String userId, String credential) {
        if (!AuthenticationProvider.validateUserId(userId)) {
            return false;
        }

        return "pass@123".equals(credential);//since we have no database i am using hardcoded credential check
    }
}
