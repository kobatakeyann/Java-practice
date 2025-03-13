package advance.chapter_01.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Library that)) {
            return false;
        }
        return Objects.equals(this.PUBLICATIONS, that.PUBLICATIONS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.PUBLICATIONS);
    }

    @Override
    public String toString() {
        if (this.PUBLICATIONS.isEmpty()) {
            return "Library is empty.";
        }
        return this.PUBLICATIONS.stream().map(Publication::toString)
                .collect(Collectors.joining("\n"));
    }
}
