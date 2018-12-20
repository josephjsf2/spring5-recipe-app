package guru.springframework.domains;

import javax.persistence.*;

public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;

    // Delete notes will not delete recipe
    @OneToOne
    private Recipe recipe;

    // For large text
    @Lob
    private String recipeNotes;

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }


}
