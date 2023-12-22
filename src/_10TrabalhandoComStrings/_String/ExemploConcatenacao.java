package _10TrabalhandoComStrings._String;

public class ExemploConcatenacao {
    public static void main(String[] args) {
        // Exemplo de concatenação com operador +
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Nome completo (usando operador +): " + fullName);

        // Exemplo de concatenação com método concat()
        String str1 = "Hello";
        String str2 = " World";
        String concatenatedString = str1.concat(str2);
        System.out.println("String concatenada (usando concat()): " + concatenatedString);

        // Exemplo de concatenação com StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("Java");
        builder.append(" é");
        builder.append(" uma");
        builder.append(" linguagem");
        builder.append(" poderosa.");
        String result = builder.toString();
        System.out.println("String concatenada (usando StringBuilder): " + result);
    }
}
