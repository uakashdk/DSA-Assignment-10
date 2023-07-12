class solution{
 private static int recLength(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return recLength(str.substring(1)) + 1;
    }
}