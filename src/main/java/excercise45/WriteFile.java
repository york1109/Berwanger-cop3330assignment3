package excercise45;

class WriteFile{

    // instance variable

    private FileWriter writer;
    private int count_Modification;
    private ArrayList<String> list;

    // constructor

    public WriteFile(String name, ArrayList<String> list) throws IOException {

        // initialize variables

        writer = new FileWriter("C:\\Users\\Ankit\\Desktop\\"+name);
        this.list = list;


    }

    // write into file

    public void writefile() throws IOException {

        // using for loop till size of list

        for(int i=0;i<list.size();i++) {

            String temp = list.get(i);

            String str = "utilize";

            int index = 0;

            // count the modifications

            while (true)
            {
                index = temp.indexOf(str, index);
                if (index != -1)
                {
                    count_Modification ++;
                    index += str.length();
                }
                else {
                    break;
                }
            }

            // modification

            temp = temp.replaceAll("utilize", "use");

            // and write into file

            writer.write(temp+"\n");


        }

        // close the writer object

        writer.close();

    }


    // method that returns the count of modifications

    public int getModification() {

        return count_Modification;

    }


}