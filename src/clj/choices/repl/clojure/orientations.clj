;; L'algorithme défini dans la documentation contient huit message
;; d'orientation possibles
(def orientations
  {:orientation_moins_de_15_ans
   "Cette application n’est pas faite pour les personnes de moins de 15 ans. Prenez contact avec votre médecin généraliste au moindre doute. En cas d’urgence, appelez le 15."
   :orientation_domicile_surveillance_1
   "Votre situation peut relever d’un COVID 19 qu’il faut surveiller. Si de nouveaux symptômes apparaissent, refaites le test ou consultez votre médecin. Nous vous conseillons de rester à votre domicile."
   :orientation_consultation_surveillance_1
   "Votre situation peut relever d’un COVID 19. Demandez une téléconsultation ou un médecin généraliste ou une visite à domicile. Appelez le 15 si une gêne respiratoire ou des difficultés importantes pour vous alimenter ou boire apparaissent pendant plus de 24 heures."
   :orientation_consultation_surveillance_2
   "Votre situation peut relever d’un COVID 19. Demandez une téléconsultation ou un médecin généraliste ou une visite à domicile. Si vous n'arrivez pas à obtenir de consultation, appelez le 15."
   :orientation_SAMU "Appelez le 15."
   :orientation_consultation_surveillance_3
   "Votre situation peut relever d’un COVID 19. Demandez une téléconsultation ou un médecin généraliste ou une visite à domicile (SOS médecins, etc.)"
   :orientation_consultation_surveillance_4
   "Votre situation peut relever d’un COVID 19. Un avis médical est recommandé. Au moindre doute, appelez le 15. Nous vous conseillons de rester à votre domicile."
   :orientation_surveillance
   "Votre situation ne relève probablement pas du COVID 19. N’hésitez pas à contacter votre médecin en cas de doute. Vous pouvez refaire le test en cas de nouveau symptôme pour réévaluer la situation. Pour toute information concernant le COVID 19, composer le 0 800 130 000."})
