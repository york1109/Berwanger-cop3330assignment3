package excercise45;

    class ReadFile{


        private ArrayList<String> list;
        private Scanner sc;


        public ReadFile() throws FileNotFoundException {

            list = new ArrayList<String>();


            File file = new File("C:\\Users\\Ankit\\Desktop\\exercise45_input.txt");
            sc = new Scanner(file);

        }

        public void readile() {


            try
            {
                int i=0;

                while( sc.hasNext() )
                {

                    // read file line by line and store it into list

                    String filedata = sc.nextLine();

                    list.add(filedata);


                }
            }
            finally
            {
                sc.close();
            }

        }


        public ArrayList<String> getdata() {

            return list;

        }

    }