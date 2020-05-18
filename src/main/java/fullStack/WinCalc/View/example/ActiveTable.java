package fullStack.WinCalc.View.example;

/*

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.EventObject;

public class ActiveTable extends JFrame {

    public ActiveTable() {
        RecordModel model = new RecordModel();
        model.addRecord(new Record());
        JTable table = new JTable(model);
        EditorAndRenderer editorAndRenderer = new EditorAndRenderer();
        table.setDefaultRenderer(Object.class, editorAndRenderer);
        table.setDefaultEditor(Object.class, editorAndRenderer);
        table.setRowHeight(38);

        add(new JScrollPane(table));
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Active Table");
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ActiveTable();
            }
        });
    }

    class RecordModel extends AbstractTableModel {

        private final List<Record> records = new ArrayList<Record>();

        @Override
        public int getColumnCount() {
            return 1;
        }

        @Override
        public int getRowCount() {
            return records.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return records.get(rowIndex);
        }

        public void addRecord(Record r) {
            records.add(r);
            fireTableRowsInserted(records.size()-1, records.size()-1);
        }

    }

    class Record {
        private int count = 1;
        public int getCount() { return count; }
        public void increase() { count = count + 1; }
    }

    class CellPanel extends JPanel {
        private Record record;
        private final JTextField field = new JTextField(8);
        private final Action increaseAction = new AbstractAction("+") {
            public void actionPerformed(ActionEvent e) {
                record.increase();
                field.setText(record.getCount()+"");
                JTable table = (JTable) SwingUtilities.getAncestorOfClass(JTable.class, (Component) e.getSource());
                table.getCellEditor().stopCellEditing();
            }
        };
        private final JButton button = new JButton(increaseAction);

        public CellPanel() {
            add(field);
            add(button);
        }

        public void setRecord(Record r) {
            record = r;
            field.setText(record.getCount()+"");
        }

        public Record getRecord() {
            return record;
        }
    }

    class EditorAndRenderer extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {

        private final CellPanel renderer = new CellPanel();
        private final CellPanel editor = new CellPanel();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            renderer.setRecord((Record) value);
            return renderer;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column) {
            editor.setRecord((Record) value);
            return editor;
        }

        @Override
        public Object getCellEditorValue() {
            return editor.getRecord();
        }

        @Override
        public boolean isCellEditable(EventObject ev) {
            return true;
        }

        @Override
        public boolean shouldSelectCell(EventObject ev) {
            return false;
        }
    }
}*/