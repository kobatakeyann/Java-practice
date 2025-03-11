package basis.chapter_17.exercise.no1_3_4;

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

    public Publication find(String searchWord) throws PublicationNotFoundException {
        for (Publication publication : this.PUBLICATIONS) {
            if (publication.getTitle().contains(searchWord)) {
                return publication;
            }
        }
        throw new PublicationNotFoundException(
                "Publication containing designated title was not found.");
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
