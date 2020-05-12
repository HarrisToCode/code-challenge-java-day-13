class ResistorColorDuo {
    int value(String[] colors) {
        String resultString = "";
        for (String color :
                colors) {
            switch (color) {
                case "black":
                    resultString += String.valueOf(0);
                    break;
                case "brown":
                    resultString += String.valueOf(1);
                    break;
                case "red":
                    resultString += String.valueOf(2);
                    break;
                case "orange":
                    resultString += String.valueOf(3);
                    break;
                case "yellow":
                    resultString += String.valueOf(4);
                    break;
                case "green":
                    resultString += String.valueOf(5);
                    break;
                case "blue":
                    resultString += String.valueOf(6);
                    break;
                case "violet":
                    resultString += String.valueOf(7);
                    break;
                case "grey":
                    resultString += String.valueOf(8);
                    break;
                case "white":
                    resultString += String.valueOf(9);
                    break;
            }
        }
        return Integer.parseInt(resultString.substring(0,2));
        //        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
