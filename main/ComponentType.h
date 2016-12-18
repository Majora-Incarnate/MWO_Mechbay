#ifndef COMPONENTTYPE_H
#define COMPONENTTYPE_H

#include <string>

class ComponentType {
    static const ComponentType ACTUATOR;
    static const ComponentType WEAPON;
    static const ComponentType AMMO;
    static const ComponentType EQUIPMENT;
    static const ComponentType HEAT_SINK;
    static const ComponentType JUMP_JET;
    static const ComponentType ARMOR;
    static const ComponentType INTERNAL;
    static const ComponentType CASE;
    static const ComponentType ENGINE;
    static const ComponentType GYRO;
    static const ComponentType MYOMER;
    static const ComponentType COCKPIT;

private:
    enum class ComponentEnum;

    const ComponentEnum enumId;
    const std::string name;

    ComponentType(const ComponentEnum & techBase, const std::string & fullName);
};

#endif // COMPONENTTYPE_H
