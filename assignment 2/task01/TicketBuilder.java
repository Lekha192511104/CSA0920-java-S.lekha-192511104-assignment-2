public class TicketBuilder {

    static String usingString(String[] fields) {
        String ticket = "";
        for (String field : fields) {
            ticket = ticket + field;
        }
        return ticket;
    }

    static String usingStringBuilder(String[] fields) {
        StringBuilder ticket = new StringBuilder();
        for (String field : fields) {
            ticket.append(field);
        }
        return ticket.toString();
    }

    static String usingStringBuffer(String[] fields) {
        StringBuffer ticket = new StringBuffer();
        for (String field : fields) {
            ticket.append(field);
        }
        return ticket.toString();
    }

    public static void main(String[] args) {

    int ticketCount = 1000;
    int fieldCount = 100;

    String[] fields = new String[fieldCount];
    long start = System.nanoTime();

    for (int i = 0; i < ticketCount; i++) {
            usingString(fields);
    }

  

    System.out.println("String Time: " + (end - start) + " ns");

    for (int i = 0; i < fieldCount; i++) {
        fields[i] = "Field" + (i + 1);
    }


    for (int i = 0; i < ticketCount; i++) {
        usingStringBuilder(fields);
    }

    long end = System.nanoTime();

    System.out.println("Workload: 10000 tickets, 50 fields");
    System.out.println("StringBuilder Time: " + (end - start) + " ns");

    start = System.nanoTime();

    for (int i = 0; i < ticketCount; i++) {
        usingStringBuffer(fields);
    }

    end = System.nanoTime();

    System.out.println("StringBuffer Time: " + (end - start) + " ns");
}
}