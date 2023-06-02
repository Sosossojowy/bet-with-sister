public class Main {
    public static void main(String[] args) {

        String text = "Anything for test";
        String lowCase = text.toLowerCase();
        String newReplace = lowCase.replace("a", "¹⁄₁");
        String newReplace2 = newReplace.replace("b", "²⁄₁");
        String newReplace3 = newReplace2.replace("c", "²⁄₁");
        String newReplace4 = newReplace3.replace("d", "⁴⁄₁");
        String newReplace5 = newReplace4.replace("e", "⁵⁄₁");
        String newReplace6 = newReplace5.replace("f", "½");
        String newReplace7 = newReplace6.replace("g", "²⁄₂");
        String newReplace8 = newReplace7.replace("h", "³⁄₂");
        String newReplace9 = newReplace8.replace("i", "⁴⁄₂");
        String newReplace10 = newReplace9.replace("j", "⁵⁄₂");
        String newReplace11 = newReplace10.replace("k", "⅓");
        String newReplace12 = newReplace11.replace("l", "⅔");
        String newReplace13 = newReplace12.replace("ł", "³⁄₃");
        String newReplace14 = newReplace13.replace("m", "⁴⁄₃");
        String newReplace15 = newReplace14.replace("n", "⁵⁄₃");
        String newReplace16 = newReplace15.replace("o", "¼");
        String newReplace17 = newReplace16.replace("p", "²⁄₄");
        String newReplace18 = newReplace17.replace("r", "¾");
        String newReplace19 = newReplace18.replace("s", "⁴⁄₄");
        String newReplace20 = newReplace19.replace("t", "⁵⁄₄");
        String newReplace21 = newReplace20.replace("u", "⅕");
        String newReplace22 = newReplace21.replace("w", "⅖");
        String newReplace23 = newReplace22.replace("x", "⅗");
        String newReplace24 = newReplace23.replace("y", "⅘");
        String newReplace25 = newReplace24.replace("z", "⁵⁄₅");
        String newReplace26 = newReplace25.replaceAll("\\s", "|");
        String newReplace27 = newReplace26.replace(",", "|,");
        String newReplace28 = newReplace27.replace(".", "|.");


        System.out.println(newReplace28);
    }
}