package br.com.useinet.ui;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

import br.com.useinet.listener.DespesaMouse;
import br.com.useinet.model.DespesaTable;

public class DespesaJTable extends JTable {

	private static final long serialVersionUID = 1L;

	public DespesaJTable(JTextField textField, JComboBox comboBox, JTextField textField1) {
		setModel(new DespesaTable());
		setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		setToolTipText("Selecione uma despesa");

		TableColumn colunaDespesa = getColumnModel().getColumn(0);
		colunaDespesa.setPreferredWidth(50);

		TableColumn colunaTipo = getColumnModel().getColumn(1);
		colunaTipo.setPreferredWidth(30);

		TableColumn colunaValor = getColumnModel().getColumn(2);
		colunaValor.setPreferredWidth(20);

		addMouseListener(new DespesaMouse(textField, comboBox, textField1, this));
	}

}
