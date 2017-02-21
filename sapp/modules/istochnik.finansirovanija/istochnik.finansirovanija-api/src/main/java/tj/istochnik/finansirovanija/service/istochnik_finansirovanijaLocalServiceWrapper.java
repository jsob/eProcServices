/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.istochnik.finansirovanija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link istochnik_finansirovanijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanijaLocalService
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaLocalServiceWrapper
	implements istochnik_finansirovanijaLocalService,
		ServiceWrapper<istochnik_finansirovanijaLocalService> {
	public istochnik_finansirovanijaLocalServiceWrapper(
		istochnik_finansirovanijaLocalService istochnik_finansirovanijaLocalService) {
		_istochnik_finansirovanijaLocalService = istochnik_finansirovanijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _istochnik_finansirovanijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _istochnik_finansirovanijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _istochnik_finansirovanijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnik_finansirovanijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnik_finansirovanijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of istochnik_finansirovanijas.
	*
	* @return the number of istochnik_finansirovanijas
	*/
	@Override
	public int getistochnik_finansirovanijasCount() {
		return _istochnik_finansirovanijaLocalService.getistochnik_finansirovanijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _istochnik_finansirovanijaLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _istochnik_finansirovanijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _istochnik_finansirovanijaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _istochnik_finansirovanijaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the istochnik_finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik_finansirovanijas
	* @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	* @return the range of istochnik_finansirovanijas
	*/
	@Override
	public java.util.List<tj.istochnik.finansirovanija.model.istochnik_finansirovanija> getistochnik_finansirovanijas(
		int start, int end) {
		return _istochnik_finansirovanijaLocalService.getistochnik_finansirovanijas(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _istochnik_finansirovanijaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _istochnik_finansirovanijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the istochnik_finansirovanija to the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was added
	*/
	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija addistochnik_finansirovanija(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return _istochnik_finansirovanijaLocalService.addistochnik_finansirovanija(istochnik_finansirovanija);
	}

	/**
	* Creates a new istochnik_finansirovanija with the primary key. Does not add the istochnik_finansirovanija to the database.
	*
	* @param istochnik_finansirovanija_id the primary key for the new istochnik_finansirovanija
	* @return the new istochnik_finansirovanija
	*/
	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija createistochnik_finansirovanija(
		long istochnik_finansirovanija_id) {
		return _istochnik_finansirovanijaLocalService.createistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Deletes the istochnik_finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was removed
	* @throws PortalException if a istochnik_finansirovanija with the primary key could not be found
	*/
	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija deleteistochnik_finansirovanija(
		long istochnik_finansirovanija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnik_finansirovanijaLocalService.deleteistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Deletes the istochnik_finansirovanija from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was removed
	*/
	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija deleteistochnik_finansirovanija(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return _istochnik_finansirovanijaLocalService.deleteistochnik_finansirovanija(istochnik_finansirovanija);
	}

	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija fetchistochnik_finansirovanija(
		long istochnik_finansirovanija_id) {
		return _istochnik_finansirovanijaLocalService.fetchistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Returns the istochnik_finansirovanija with the primary key.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija
	* @throws PortalException if a istochnik_finansirovanija with the primary key could not be found
	*/
	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija getistochnik_finansirovanija(
		long istochnik_finansirovanija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnik_finansirovanijaLocalService.getistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Updates the istochnik_finansirovanija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was updated
	*/
	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija updateistochnik_finansirovanija(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return _istochnik_finansirovanijaLocalService.updateistochnik_finansirovanija(istochnik_finansirovanija);
	}

	@Override
	public istochnik_finansirovanijaLocalService getWrappedService() {
		return _istochnik_finansirovanijaLocalService;
	}

	@Override
	public void setWrappedService(
		istochnik_finansirovanijaLocalService istochnik_finansirovanijaLocalService) {
		_istochnik_finansirovanijaLocalService = istochnik_finansirovanijaLocalService;
	}

	private istochnik_finansirovanijaLocalService _istochnik_finansirovanijaLocalService;
}