class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        boolean upperNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);

            switch (c) {
                case '4': c = 'a'; break;
                case '3': c = 'e'; break;
                case '0': c = 'o'; break;
                case '1': c = 'l'; break;
                case '7': c = 't'; break;
            }

            if (c == '-') {
                upperNext = true;   
                continue;        
            }

            if (c == ' ') {
                cleaned.append('_');
                continue;
            }

            if (!Character.isLetter(c) && c != '_') {
                continue;           
            }

            if (upperNext) {
                cleaned.append(Character.toUpperCase(c));
                upperNext = false;
            } else {
                cleaned.append(c);
            }
        }

        return cleaned.toString();
    }
}
