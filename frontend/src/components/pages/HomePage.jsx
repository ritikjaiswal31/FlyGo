import { useState, useEffect } from "react";
import { useNavigate, Link } from "react-router-dom";
import ApiService from "../../services/ApiService";
import { useMessage } from "../common/MessageDisplay";

const HomePage = () => {

    const { ErrorDisplay, SuccessDisplay, showError } = useMessage();
    const navigate = useNavigate();
    const [airports, setAirports] = useState([]);

    const [searchData, setSearchData] = useState({
        departureIataCode: "",
        arrivalIataCode: "",
        departureDate: ""
    });

    useEffect(() => {
        const fetchAirports = async () => {
            try {
                const response = await ApiService.getAllAirports();
                setAirports(response.data || []);
            } catch (error) {
                showError("Failed to load airports");
            }
        };
        fetchAirports();
    }, []);

    const handleSearch = async (e) => {
        e.preventDefault();

        if (!searchData.departureIataCode || !searchData.arrivalIataCode) {
            showError("Please select departure and arrival airports");
            return;
        }
        navigate(`/flights?departureIataCode=${searchData.departureIataCode}&arrivalIataCode=${searchData.arrivalIataCode}&departureDate=${searchData.departureDate}`);
    };

    const handleSwapAirports = () => {
        setSearchData({
            ...searchData,
            departureIataCode: searchData.arrivalIataCode,
            arrivalIataCode: searchData.departureIataCode
        });
    };

    const formatAirportOption = (airport) => {
        return `${airport.iataCode} (${airport.city}) - ${airport.name}`;
    };

    return (
        <div className="home-page">
            <div className="hero-section">
                <div className="hero-content">
                    <h1>Book Your Flight with FlyGo</h1>
                    <p>Find the best deals for your journey</p>
                </div>

                <div className="search-box">
                    <ErrorDisplay />
                    <SuccessDisplay />

                    <form onSubmit={handleSearch}>
                        <div className="search-fields">
                            <div className="form-group">
                                <label>From</label>
                                <select
                                    value={searchData.departureIataCode}
                                    onChange={(e) => setSearchData({
                                        ...searchData,
                                        departureIataCode: e.target.value
                                    })}
                                    required
                                >
                                    <option value="">Select Departure Airport</option>
                                    {airports.map(airport => (
                                        <option key={`dep-${airport.iataCode}`} value={airport.iataCode}>
                                            {formatAirportOption(airport)}
                                        </option>
                                    ))}
                                </select>
                            </div>

                            <div className="swap-cities">
                                <button
                                    type="button"
                                    onClick={handleSwapAirports}
                                    aria-label="Swap departure and arrival"
                                >
                                    ↔
                                </button>
                            </div>

                            <div className="form-group">
                                <label>To</label>
                                <select
                                    value={searchData.arrivalIataCode}
                                    onChange={(e) => setSearchData({
                                        ...searchData,
                                        arrivalIataCode: e.target.value
                                    })}
                                    required
                                >
                                    <option value="">Select Arrival Airport</option>

                                    {airports
                                        .filter(airport => airport.iataCode !== searchData.departureIataCode)
                                        .map(airport => (
                                            <option key={`arr-${airport.iataCode}`} value={airport.iataCode}>
                                                {formatAirportOption(airport)}
                                            </option>
                                        ))}
                                </select>
                            </div>

                            <div className="form-group">
                                <label>Departure Date</label>
                                <input
                                    required
                                    type="date"
                                    value={searchData.departureDate}
                                    onChange={(e) => setSearchData({
                                        ...searchData,
                                        departureDate: e.target.value
                                    })}
                                    min={new Date().toISOString().split('T')[0]}
                                />
                            </div>
                        </div>

                        <button type="submit" className="search-button">
                            Search Flights
                        </button>
                    </form>
                </div>
            </div>

        </div>
    );
};

export default HomePage;