package lt.baltictalents.stoteliutinklas.interfeisai;

import java.util.List;

import lt.baltictalents.stoteliutinklas.beans.Square;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public interface BusStopSearchService {
	public List<Station> getBusStopsInSquate(Square square);
}
