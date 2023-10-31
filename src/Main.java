public class Main {

    public static void main(String[] args) {

        Button btnLogin = new Button();
        btnLogin.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick()
            {
                System.out.println("User is logged in");
            }
        });

        Button btnLogout = new Button();
        btnLogout.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick()
            {
                System.out.println("User is logged out");
            }

        });

    }
}