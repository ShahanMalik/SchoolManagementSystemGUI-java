
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DataBase extends JPanel {
    private final JTable table;

    DataBase() {
        super(new BorderLayout(3, 3));
        this.table = new JTable(new MyModel());
        this.table.setPreferredScrollableViewportSize(new Dimension(700, 70));
        this.table.setFillsViewportHeight(true);
        JPanel ButtonOpen = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(ButtonOpen, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        Student_CSVFile Rd = new Student_CSVFile();
        MyModel NewModel = new MyModel();
        this.table.setModel(NewModel);
        File DataFile = new File("OOPS.csv");
        ArrayList<String[]> Rs2 = Rd.ReadCSVfile(DataFile);
        NewModel.AddCSVData(Rs2);
    }

    public class Student_CSVFile {
        private final ArrayList<String[]> Rs = new ArrayList<String[]>();
        private String[] OneRow;

        public ArrayList<String[]> ReadCSVfile(File DataFile) {
            try {
                try (BufferedReader brd = new BufferedReader(new FileReader(DataFile))) {
                    while (brd.ready()) {
                        String st = brd.readLine();
                        OneRow = st.split(",|\\s|;");
                        Rs.add(OneRow);
                    } 
                }
            } 
            catch (Exception e) {
                String errmsg = e.getMessage();
                System.out.println("File not found:" + errmsg);
            } 
            return Rs;
        }
    }

    static void createAndShowGUI() {
        JFrame frame = new JFrame("T1Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DataBase newContentPane = new DataBase();
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,400); 
    }

    class MyModel extends AbstractTableModel {
        private final String[] columnNames = { "1", "2", "3", "4","5","6","7"};
        private ArrayList<String[]> Data = new ArrayList<String[]>();

        public void AddCSVData(ArrayList<String[]> DataIn) {
            this.Data = DataIn;
            this.fireTableDataChanged();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public int getRowCount() {
            return Data.size();
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Object getValueAt(int row, int col) {
            return Data.get(row)[col];
        }
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
