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

package tj.balans.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.balans.postavwika.exception.NoSuchbalans_postavwikaException;
import tj.balans.postavwika.model.balans_postavwika;

/**
 * The persistence interface for the balans_postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.balans.postavwika.service.persistence.impl.balans_postavwikaPersistenceImpl
 * @see balans_postavwikaUtil
 * @generated
 */
@ProviderType
public interface balans_postavwikaPersistence extends BasePersistence<balans_postavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link balans_postavwikaUtil} to access the balans_postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the balans_postavwika in the entity cache if it is enabled.
	*
	* @param balans_postavwika the balans_postavwika
	*/
	public void cacheResult(balans_postavwika balans_postavwika);

	/**
	* Caches the balans_postavwikas in the entity cache if it is enabled.
	*
	* @param balans_postavwikas the balans_postavwikas
	*/
	public void cacheResult(
		java.util.List<balans_postavwika> balans_postavwikas);

	/**
	* Creates a new balans_postavwika with the primary key. Does not add the balans_postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new balans_postavwika
	* @return the new balans_postavwika
	*/
	public balans_postavwika create(long balans_postavwika_id);

	/**
	* Removes the balans_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the balans_postavwika
	* @return the balans_postavwika that was removed
	* @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	*/
	public balans_postavwika remove(long balans_postavwika_id)
		throws NoSuchbalans_postavwikaException;

	public balans_postavwika updateImpl(balans_postavwika balans_postavwika);

	/**
	* Returns the balans_postavwika with the primary key or throws a {@link NoSuchbalans_postavwikaException} if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans_postavwika
	* @return the balans_postavwika
	* @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	*/
	public balans_postavwika findByPrimaryKey(long balans_postavwika_id)
		throws NoSuchbalans_postavwikaException;

	/**
	* Returns the balans_postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans_postavwika
	* @return the balans_postavwika, or <code>null</code> if a balans_postavwika with the primary key could not be found
	*/
	public balans_postavwika fetchByPrimaryKey(long balans_postavwika_id);

	@Override
	public java.util.Map<java.io.Serializable, balans_postavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the balans_postavwikas.
	*
	* @return the balans_postavwikas
	*/
	public java.util.List<balans_postavwika> findAll();

	/**
	* Returns a range of all the balans_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans_postavwikas
	* @param end the upper bound of the range of balans_postavwikas (not inclusive)
	* @return the range of balans_postavwikas
	*/
	public java.util.List<balans_postavwika> findAll(int start, int end);

	/**
	* Returns an ordered range of all the balans_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans_postavwikas
	* @param end the upper bound of the range of balans_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of balans_postavwikas
	*/
	public java.util.List<balans_postavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<balans_postavwika> orderByComparator);

	/**
	* Returns an ordered range of all the balans_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans_postavwikas
	* @param end the upper bound of the range of balans_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of balans_postavwikas
	*/
	public java.util.List<balans_postavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<balans_postavwika> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the balans_postavwikas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of balans_postavwikas.
	*
	* @return the number of balans_postavwikas
	*/
	public int countAll();
}