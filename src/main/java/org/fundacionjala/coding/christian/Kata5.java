package org.fundacionjala.coding.christian;

/**
 * Develop by Christian.
 */
public class Kata5 {

    /**
     * @param dna hi is for makeComplement
     * @return tag for 'dna'
     */
    public String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        final String t = "T";
        final String a = "A";
        final String g = "G";
        final String c = "C";

        StringBuilder builder = new StringBuilder();
        for (char w : chars) {
            switch  (w) {
                case 'A':  builder.append(t);
                    break;
                case 'T':  builder.append(a);
                    break;
                case 'C':  builder.append(g);
                    break;
                case 'G':  builder.append(c);
                    break;
                default:
                    break;
            }
        }

        return builder.toString();
    }
}
