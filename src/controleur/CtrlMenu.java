package controleur;

import javax.swing.JOptionPane;
import vue.VueMenu;

/**
 * Contrôleur de la fenêtre VueMenu
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */

public class CtrlMenu extends CtrlAbstrait {

    public CtrlMenu(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueMenu(this);
    }

    /**
     * clic sur la commande Quitter du menu Fichier Le contrôleur délègue
     * l'action au contrôleur frontal
     */
    public void fichierQuitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "Ambulances", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            this.getCtrlPrincipal().action(EnumAction.MENU_VISITEUR_QUITTER);
        }
    }

    /**
     * clic sur la commande Ajouter du menu presence Le contrôleur délègue
     * l'action au contrôleur frontal
     */
    public void visiteurAfficher() {
        this.getCtrlPrincipal().action(EnumAction.MENU_VISITEUR_AFFICHER);
    }

    @Override
    public VueMenu getVue() {
        return (VueMenu) vue;
    }
}
