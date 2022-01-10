import java.io.IOException;
import Repository.OffertenRepository;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        OffertenRepository offertenRepository = new OffertenRepository("offerten.txt");
        System.out.println();
    }
}
