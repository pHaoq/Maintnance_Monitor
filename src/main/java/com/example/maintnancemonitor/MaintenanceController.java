package com.example.maintnancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {

    private String message = "Everything works as expected";

    @RequestMapping("/api/message")
    public String message(){
        return message;
    }

    @RequestMapping("/")
    public String homepage() {
    return String.format("Willkommen beim Maintenance Monitor von Matthias und Hao." + "<br>" +
                         "Es wird rund um die Uhr kontrolliert, ob die Stromversorgung läuft." + "<br>" +
                         "Hier sind paar Beispiele wie das Monitoring funktioniert:" + "<br>" +
                         "<br>" +
                         "mit /api/message kann der derzeitige Status angezeigt werden" + "<br>" +
                         "mit /api/message/set?m=BENUZERDEFINIERTE_NACHRICHT kann eine benutzerdefinierte Nachricht hinterlegt werden" + "<br>" +
                         "mit /api/message/reset kann die Nachricht wieder zurückgesetzt werden"
                        );
    }
}
