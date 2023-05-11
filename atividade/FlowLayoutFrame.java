package atividade;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {

    private JButton leftJButton; // botão para configurar alinhamento à esquerda
    private JButton centerJButton; // botão para configurar alinhamento centralizado
    private JButton rightJButton; // botão para configurar alinhamento à direita
    private FlowLayout layout; // objeto de layout
    private Container container; // contêiner para configurar layout

    // configura CUI e registra listeners de botão
    public FlowLayoutFrame() {
        super("FlowLayout Demo");
        layout = new FlowLayout(); // cria FlowLayout
        container = getContentPane(); // obtém contêiner p setLayout(layout); // configura o layout de frame
        setLayout(layout);

        // configura leftJButton e registra listener
        leftJButton = new JButton("Left"); // cria botão
        add(leftJButton); // adiciona o botão Left ao frame
        leftJButton.addActionListener(new ActionListener() {
            // classe interna anônima
            // processa o evento leftJButton
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.LEFT);
                // configura alinhamento à esquerda
                // realinha os componentes anexados
                layout.layoutContainer(container);
            } // fim do método actionPerformed
        }); // fim da chamada para addActionListener

        // configura centerJButton e registra o listener
        centerJButton = new JButton("Center"); // cria botão
        add(centerJButton); // adiciona botão Center ao frame
        centerJButton.addActionListener(new ActionListener() {
            // classe interna anônima
            // processa evento centerJButton
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.CENTER);
                // configura alinhamento centralizado
                // realinha os componentes anexados
                layout.layoutContainer(container);
            } // fim do método actionPerformed
        }); // fim da chamada para addActionListener

        // configura rightJButton e registra o listener
        rightJButton = new JButton("Right"); // cria botão
        add(rightJButton); // adiciona botão Right ao frame
        rightJButton.addActionListener(new ActionListener() {
            // classe interna anônima
            // processo evento rightJButton
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.RIGHT);
                // configura alinhamento à direita
                // realinha os componentes anexados
                layout.layoutContainer(container);
            } // fim do método actionPerformed
        }); // fim da chamada para addActionListener

        // realinha os componentes anexados
        layout.layoutContainer(container);
    } // fim do construtor FlowLayoutFrame
}