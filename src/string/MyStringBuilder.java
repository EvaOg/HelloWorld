package string;

public class MyStringBuilder {
    public static void main(String[] args) {

        StringBuilder html = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            html.append("    <tr style=\"background-color: ").append(i % 2 == 0 ? "lightblue" : "white").append(";\">\n")
                    .append("        <td>Row ").append(i).append("</td>\n")
                    .append("        <td>xxxx</td>\n")
                    .append("    </tr>\n");
        }



        System.out.println("<table>\n" +
                (html.toString()) +
                "</table>\n");


    }

}
