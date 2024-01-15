Feature: MakeMyTrip
 Scenario: Search ticket
   Given Launch the Browser
   When user opens url: "https://www.makemytrip.com/"
   And Close the notification popup if present
   And Close the login page if present
   And user accepts cookies if present
   Then Enter the From city - "HYD"
   Then Enter the To City - "MAA"
   And Enter the depature date
   And Enter the return date
   Then Click search
   Then  Check the page title - "Flights from"
   And close Browser