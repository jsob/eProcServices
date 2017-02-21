create table sapp.dostup_po_podrazdelenijam (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	dostup_po_podrazdelenijam_id LONG not null primary key,
	izmenil LONG,
	podrazdelenija_id LONG,
	polzovateli_id LONG,
	sozdal LONG
);