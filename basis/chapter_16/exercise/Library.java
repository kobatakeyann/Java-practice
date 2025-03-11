package basis.chapter_16.exercise;

import java.util.ArrayList;
import java.util.List;

class Library {
    private final List<Publication> PUBLICATIONS;

    public Library() {
        this.PUBLICATIONS = new ArrayList<>();
    }

    public void add(Publication publication) {
        this.PUBLICATIONS.add(publication);
    }

    public void findAndShow(String searchWord) {
        System.out.printf("「%s」で検索します…\n", searchWord);
        for (Publication publication : this.PUBLICATIONS) {
            if (publication.getTitle().contains(searchWord)) {
                publication.buildDisplayLine();
                return;
            }
        }
        System.out.printf("\"%s\"に該当する書籍は見つかりませんでした\n", searchWord);
    }

    public void displayAll() {
        for (Publication publication : this.PUBLICATIONS) {
            publication.buildDisplayLine();
        }
    }
}
