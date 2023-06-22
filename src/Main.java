public class Main {
    public static void main(String[] args) {

        String text = "Anything for test";
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'a':
                    result.append("¹⁄₁");
                    break;
                case 'b':
                    result.append("²⁄₁");
                    break;
                case 'c':
                    result.append("³⁄₁");
                    break;
                case 'd':
                    result.append("⁴⁄₁");
                    break;
                case 'e':
                    result.append("⁵⁄₁");
                    break;
                case 'f':
                    result.append("½");
                    break;
                case 'g':
                    result.append("²⁄₂");
                    break;
                case 'h':
                    result.append("³⁄₂");
                    break;
                case 'i':
                    result.append("⁴⁄₂");
                    break;
                case 'j':
                    result.append("⁵⁄₂");
                    break;
                case 'k':
                    result.append("⅓");
                    break;
                case 'l':
                    result.append("⅔");
                    break;
                case 'ł':
                    result.append("³⁄₃");
                    break;
                case 'm':
                    result.append("⁴⁄₃");
                    break;
                case 'n':
                    result.append("⁵⁄₃");
                    break;
                case 'o':
                    result.append("¼");
                    break;
                case 'p':
                    result.append("²⁄₄");
                    break;
                case 'r':
                    result.append("¾");
                    break;
                case 's':
                    result.append("⁴⁄₄");
                    break;
                case 't':
                    result.append("⁵⁄₄");
                    break;
                case 'u':
                    result.append("⅕");
                    break;
                case 'w':
                    result.append("⅖");
                    break;
                case 'x':
                    result.append("⅗");
                    break;
                case 'y':
                    result.append("⅘");
                    break;
                case 'z':
                    result.append("⁵⁄₅");
                    break;
                case ' ':
                    result.append("|");
                    break;
                case ',':
                    result.append("|,");
                    break;
                case '.':
                    result.append("|.");
                    break;
                default:
                    result.append(c);
            }
        }

        String finalResult = result.toString();
        System.out.println(finalResult);
    }
}
