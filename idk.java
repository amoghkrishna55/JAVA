public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String url = "https://he1lx.vercel.app/test/1/";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    int responseCode = con.getResponseCode();
    System.out.println("GET request sent, Response Code : " + responseCode);
}

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String url = "https://he1lx.vercel.app/test/1/";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    int responseCode = con.getResponseCode();
    System.out.println("GET request sent, Response Code : " + responseCode);
}